package com.tilseier.higherloweremojigame.util

import android.text.TextUtils
import java.text.SimpleDateFormat
import java.util.*

class TrackingEvent internal constructor(builder: Builder) {
    val eventName: String = builder.eventName
    val attributes: Map<String, Any?> = builder.attributes

    var fired = 0

    @Throws(Throwable::class)
    protected fun finalize() {
        check(fired != 0) { "Event not fired" }
    }

    fun isFired(): Boolean {
        return fired > 0
    }

    fun fire() {
        check(fired <= 0) { "Event already fired" }
        fired++
        TrackingUtil.fireEvent(this)
    }

    class Builder internal constructor() {
        var eventName: String = ""
        var attributes: MutableMap<String, Any?> = HashMap()
        var dateFormat: SimpleDateFormat? = null

        private fun format(date: Date?): String? {
            if (date == null) return null
            if (dateFormat == null) {
                dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US)
            }
            return dateFormat!!.format(date)
        }

        val hasEventName: Boolean
            get() = !TextUtils.isEmpty(eventName)

        fun withEventName(eventName: String): Builder {
            this.eventName = eventName
            return this
        }

        fun withAttribute(key: String, value: Date?): Builder {
            attributes[key] = format(value)
            return this
        }

        fun withAttribute(key: String, value: Any?): Builder {
            attributes[key] = value
            return this
        }

        fun build(): TrackingEvent {
            require(!TextUtils.isEmpty(eventName)) { "Missing event name" }
            return TrackingEvent(this)
        }
    }

    companion object {
        fun newBuilder(): Builder {
            return Builder()
        }
    }
}

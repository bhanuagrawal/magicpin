package com.bhanu.magicpin

enum class EventType{
    UPDATE, DELETE
}

data class MessageEvent(val type: EventType, val item: Any?)
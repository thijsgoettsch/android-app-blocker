package io.github.appblocker

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent

class BlockService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        Log.d("Accessibility", "test1234")

        if (event?.eventType == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED) {
            val packageName = event.packageName?.toString()

            Log.d("Accessibility", "App geopend: $packageName")

            if (packageName == "com.reddit.frontpage") {

            }
        }
    }

    override fun onInterrupt() {
    }
}
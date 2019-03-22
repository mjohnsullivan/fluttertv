package dev.flutter.androidtv.fluttertv

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)
    Log.w("FlutterActivity", "Created Flutter App")
  }

  override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
    Log.w("FlutterActivity","Key pressed: $keyCode")
    return super.onKeyDown(keyCode, event)
  }

  override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
    Log.w("FlutterActivity","Key released: $keyCode")
    return super.onKeyUp(keyCode, event)
  }
}

package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new com.flutter_media_downloader.flutter_media_downloader.FlutterMediaDownloaderPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_media_downloader, com.flutter_media_downloader.flutter_media_downloader.FlutterMediaDownloaderPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.pk.wallpapermanager.flutter_wallpaper_manager.FlutterWallpaperManagerPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_wallpaper_manager, com.pk.wallpapermanager.flutter_wallpaper_manager.FlutterWallpaperManagerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.crazecoder.openfile.OpenFilePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin open_file, com.crazecoder.openfile.OpenFilePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.baseflow.permissionhandler.PermissionHandlerPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.tekartik.sqflite.SqflitePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e);
    }
  }
}

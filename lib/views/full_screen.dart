import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter_cache_manager/flutter_cache_manager.dart';
import 'package:flutter_wallpaper_manager/flutter_wallpaper_manager.dart';


class FullScreen extends StatelessWidget {
  String imgUrl;
  DefaultCacheManager defaultCacheManager;

  FullScreen({Key? key, required this.imgUrl,required this.defaultCacheManager}) : super(key: key);
  final GlobalKey<ScaffoldState> _scaffoldKey = GlobalKey<ScaffoldState>();

  Future<void> setWallpaperFromFile(
      String wallpaperUrl, BuildContext context) async {

    try {
      await setWallpaper(imgUrl);
    } on PlatformException catch (error) {
      print(error);
      ScaffoldMessenger.of(context)
          .showSnackBar(SnackBar(content: Text("Error Occurred - $error")));
    }
  }

  Future<void> setWallpaper(String imageUrl) async {
    try {
      int location = WallpaperManager
          .BOTH_SCREEN;



      var file = await defaultCacheManager.getSingleFile(imageUrl);
      final bool result =
      await WallpaperManager.setWallpaperFromFile(file.path, location);
      print(result);
    } on PlatformException {
      print("EXEPTION: FAILED TO SET WALLPAPER");
    }


  }
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      key: _scaffoldKey,
      floatingActionButton: ElevatedButton(
        onPressed: () async {
          await setWallpaperFromFile(imgUrl, context);
        },
        child: Text("Set Wallpaper"),
      ),
      floatingActionButtonLocation: FloatingActionButtonLocation.centerDocked,
      body: Container(
        height: MediaQuery.of(context).size.height,
        width: MediaQuery.of(context).size.width,
        decoration: BoxDecoration(
          image: DecorationImage(
            image: NetworkImage(imgUrl),
            fit: BoxFit.cover,
          ),
        ),
      ),
    );
  }
}
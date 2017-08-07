# RNInLocoDemo

This is a demo showing how to use In Loco Media ads in React Native.

### How to run

1. `npm install`;
2. `react-native link`;
3. Replace the call to `options.setAdsKey("YOUR_APP_ID")` in `android/app/src/main/java/com/rninlocodemo/MainActivity.java` with your appId;
4. Replace the call to `options.setDevelopmentDevices("Devices_ids");` in `android/app/src/main/java/com/rninlocodemo/MainActivity.java` with the correct development device ids;
5. Replace the AdMobBanner adUnitId in the file `index.android.js`
6. Run: `react-native run-android`

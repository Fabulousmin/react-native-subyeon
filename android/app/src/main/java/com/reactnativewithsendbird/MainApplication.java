package com.reactnativewithsendbird;

import android.app.Application;

import com.evollu.react.fcm.FIRMessagingPackage;
import com.facebook.react.ReactApplication;
import com.dooboolab.kakaologins.RNKakaoLoginsPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.imagepicker.ImagePickerPackage;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.dooboolab.kakaologins.GlobalApplication;

import java.util.Arrays;
import java.util.List;
public class MainApplication extends GlobalApplication implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
        new MainReactPackage(),
            new RNKakaoLoginsPackage(),
        new VectorIconsPackage(),
        new FIRMessagingPackage(),
        new ImagePickerPackage(),
        new RNFetchBlobPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}

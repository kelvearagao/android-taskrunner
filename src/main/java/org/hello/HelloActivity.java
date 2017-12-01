package org.hello;

import org.joda.time.LocalTime;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_layout);
    }

    @Override
    public void onStart() {
        super.onStart();
        LocalTime currentTime = new LocalTime();
        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText("The current local time is: " + currentTime);
    }

}

// instalando a imagem
// sdkmanager --verbose "system-images;android-22;google_apis;x86" # precisa do halmx
// sdkmanager "system-images;android-22;default;armeabi-v7a" --verbose # nao prestou!
// sdkmanager "system-images;android-22;google_apis;armeabi-v7a" --verbose # ok

// criand um avd
// avdmanager -v create avd -n test1 -k system-images;android-22;google_apis;x86 --tag google_apis
// avdmanager -v create avd -n test1_arm -k system-images;android-22;default;armeabi-v7a # erro
// avdmanager -v create avd -n test1_arm_ga -k system-images;android-22;google_apis;armeabi-v7a --tag google_apis # ok

// instalando o emulador
// sdkmanager "emulator" --verbose

// atualizar o sdk
// sdkmanager.bat --sdk_root=sdkRootPath --command
// sdk-tools-windows-3859397\tools-tmp\bin\sdkmanager --sdk_root=C:\Users\kelve.aragao\projetos\android-gradle\sdk-tools-windows-3859397 --update

// sobe o emulador
// %ANDROID_HOME%\tools\emulator -avd test1_arm_ga 

// install app
// %ANDROID_HOME%\platform-tools\adb devices 
// %ANDROID_HOME%\platform-tools\adb -s emulator-5554 install myapp.apk


// referencia
// https://spring.io/guides/gs/gradle-android/
// https://spring.io/guides/gs/android/
// https://developer.android.com/studio/command-line/sdkmanager.html


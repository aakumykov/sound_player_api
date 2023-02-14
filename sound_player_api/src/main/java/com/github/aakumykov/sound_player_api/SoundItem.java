package com.github.aakumykov.sound_player_api;

import android.net.Uri;

import androidx.annotation.NonNull;

import java.io.File;

public interface SoundItem {
    @NonNull String getId();
    String getTitle();
    File getFile();
    @NonNull Uri getFileUri();
}

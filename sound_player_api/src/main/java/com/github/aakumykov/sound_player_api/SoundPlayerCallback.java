package com.github.aakumykov.sound_player_api;

import androidx.annotation.NonNull;

public interface SoundPlayerCallback {
    default void onPlayerStateChanged(@NonNull PlayerState playerState) {}
}

package com.github.aakumykov.sound_player_api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

import java.util.List;

public interface SoundPlayer {

    void play(@NonNull SoundItem soundItem);
    void play(List<SoundItem> soundItemList);
    void pause();
    void resume();
    void stop();
    void skipToNext();
    void skipToPrev();
    boolean isPlaying();
    boolean isPaused();
    boolean isStopped();

    void release();

    void addCallback(SoundPlayerCallback callback);
    void removeCallback(SoundPlayerCallback callback);

    @Nullable
    Throwable getError();

    @Nullable
    SoundItem getCurrentItem();

    @NonNull
    PlayerState getCurrentState();

    LiveData<PlayerState> getPlayerState();
}
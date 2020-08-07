package com.likethesalad.android.buddylib.di

import com.likethesalad.android.buddylib.AndroidBuddyLibraryPlugin
import com.likethesalad.android.buddylib.providers.AndroidBuddyLibExtensionProvider
import com.likethesalad.android.buddylib.providers.TaskContainerProvider
import dagger.Module
import dagger.Provides

@Module
class LibraryModule(private val androidBuddyLibraryPlugin: AndroidBuddyLibraryPlugin) {

    @Provides
    @LibraryScope
    fun provideTaskContainerProvider(): TaskContainerProvider {
        return androidBuddyLibraryPlugin
    }

    @Provides
    @LibraryScope
    fun provideAndroidBuddyLibExtensionProvider(): AndroidBuddyLibExtensionProvider {
        return androidBuddyLibraryPlugin
    }
}
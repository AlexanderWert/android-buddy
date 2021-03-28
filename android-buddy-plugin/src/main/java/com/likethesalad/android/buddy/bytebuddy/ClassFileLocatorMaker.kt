package com.likethesalad.android.buddy.bytebuddy

import com.likethesalad.android.common.utils.bytebuddy.ByteBuddyClassesInstantiator
import com.likethesalad.android.buddy.di.AppScope
import net.bytebuddy.dynamic.ClassFileLocator
import java.io.File
import javax.inject.Inject

@AppScope
class ClassFileLocatorMaker
@Inject constructor(private val byteBuddyClassesInstantiator: ByteBuddyClassesInstantiator) {

    fun make(filesAndDirs: Set<File>): ClassFileLocator {
        val classFileLocators: MutableList<ClassFileLocator> = mutableListOf()

        for (artifact in filesAndDirs) {
            classFileLocators.add(
                if (artifact.isFile) {
                    byteBuddyClassesInstantiator.makeJarClassFileLocator(artifact)
                } else {
                    byteBuddyClassesInstantiator.makeFolderClassFileLocator(artifact)
                }
            )
        }

        return byteBuddyClassesInstantiator.makeCompoundClassFileLocator(classFileLocators)
    }
}
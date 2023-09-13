package io.ksmt.solver.yices

import io.ksmt.utils.library.NativeLibraryLoaderArm
import io.ksmt.utils.library.NativeLibraryLoaderMac
import io.ksmt.utils.library.NativeLibraryLoaderUtils

class KYicesNativeLibraryLoaderMacArm :
    KYicesNativeLibraryLoader,
    NativeLibraryLoaderMac,
    NativeLibraryLoaderArm {
    override fun load() {
        NativeLibraryLoaderUtils.loadLibrariesFromResources(this, libraries)
    }

    companion object {
        private val libraries = listOf("libyices", "libyices2java")
    }
}
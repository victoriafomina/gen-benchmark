package org.ksmt.solver.bitwuzla.bindings

import io.ksmt.utils.library.NativeLibraryLoaderLinux
import io.ksmt.utils.library.NativeLibraryLoaderUtils
import io.ksmt.utils.library.NativeLibraryLoaderX64

class KBitwuzlaNativeLibraryLoaderLinuxX64 :
    KBitwuzlaNativeLibraryLoader,
    NativeLibraryLoaderLinux,
    NativeLibraryLoaderX64 {
    override fun load() {
        NativeLibraryLoaderUtils.loadLibrariesFromResources(this, libraries)
    }

    companion object {
        private val libraries = listOf("libbitwuzla", "libbitwuzla_jni")
    }
}

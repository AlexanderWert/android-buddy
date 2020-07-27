package com.likethesalad.android.buddy.utils

import com.likethesalad.android.buddy.modules.customconfig.CustomConfigurationResolver
import com.likethesalad.android.buddy.providers.GradleConfigurationsProvider
import com.likethesalad.android.testutils.BaseMockable
import io.mockk.impl.annotations.MockK
import org.gradle.api.artifacts.ConfigurationContainer

class CustomConfigurationResolverTest : BaseMockable() {

    @MockK
    lateinit var gradleConfigurationsProvider: GradleConfigurationsProvider

    @MockK
    lateinit var configurationContainer: ConfigurationContainer

    @MockK
    lateinit var androidVariantDataProvider: AndroidVariantDataProvider

    private lateinit var customConfigurationResolver: CustomConfigurationResolver

//    @Before
//    fun setUp() {
//        every { configurationContainer.findByName(any()) }.answers {
//            val configMock = mockk<Configuration>()
//            every { configMock.name }.returns(firstArg())
//            configMock
//        }
//        every { gradleConfigurationsProvider.getConfigurationContainer() }.returns(configurationContainer)
//        customConfigurationResolver =
//            CustomConfigurationResolver(
//                gradleConfigurationsProvider,
//                androidVariantDataProvider
//            )
//    }
//
//    @Test
//    fun `Provide implementation configurations for path`() {
//        val variantPath = listOf("demo", "debug", "demoDebug")
//        val expectedConfigNames = listOf(
//            "androidBuddyImplementation",
//            "androidBuddyDemoImplementation",
//            "androidBuddyDebugImplementation",
//            "androidBuddyDemoDebugImplementation"
//        )
//        every { androidVariantDataProvider.getVariantPath() }.returns(variantPath)
//
//        val result = customConfigurationResolver.getImplementationConfiguration()
//
//        Truth.assertThat(result.map { it.name }).containsExactlyElementsIn(expectedConfigNames)
//    }
//
//    @Test
//    fun `Provide api configurations for path`() {
//        val variantPath = listOf("full", "release", "fullRelease")
//        val expectedConfigNames = listOf(
//            "androidBuddyApi",
//            "androidBuddyFullApi",
//            "androidBuddyReleaseApi",
//            "androidBuddyFullReleaseApi"
//        )
//        every { androidVariantDataProvider.getVariantPath() }.returns(variantPath)
//
//        val result = customConfigurationResolver.getApiConfiguration()
//
//        Truth.assertThat(result.map { it.name }).containsExactlyElementsIn(expectedConfigNames)
//    }
//
//    @Test
//    fun `Provide only existing implementation configurations, in case some are not found`() {
//        val variantPath = listOf("demo", "debug", "demoDebug")
//        val expectedConfigNames = listOf(
//            "androidBuddyImplementation",
//            "androidBuddyDebugImplementation",
//            "androidBuddyDemoDebugImplementation"
//        )
//        every { configurationContainer.findByName("androidBuddyDemoImplementation") }.returns(null)
//        every { androidVariantDataProvider.getVariantPath() }.returns(variantPath)
//
//        val result = customConfigurationResolver.getImplementationConfiguration()
//
//        Truth.assertThat(result.map { it.name }).containsExactlyElementsIn(expectedConfigNames)
//    }
//
//    @Test
//    fun `Provide only existing api configurations, in case some are not found`() {
//        val variantPath = listOf("full", "release", "fullRelease")
//        val expectedConfigNames = listOf(
//            "androidBuddyApi",
//            "androidBuddyFullApi",
//            "androidBuddyFullReleaseApi"
//        )
//        every { configurationContainer.findByName("androidBuddyReleaseApi") }.returns(null)
//        every { androidVariantDataProvider.getVariantPath() }.returns(variantPath)
//
//        val result = customConfigurationResolver.getApiConfiguration()
//
//        Truth.assertThat(result.map { it.name }).containsExactlyElementsIn(expectedConfigNames)
//    }
}
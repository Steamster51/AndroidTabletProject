#include <jni.h>
#include <string>
using namespace std;

extern "C" JNIEXPORT jstring JNICALL
Java_com_dmytro_myapplication_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

float bestprice = 0;
extern "C" JNIEXPORT jstring JNICALL
Java_com_dmytro_myapplication_MainActivity_personsincome(JNIEnv* env,jobject /* this */, jfloat income) {
    bestprice = income / 2 / 12;
    string bestbudjet = "Best average price is: $" + to_string(bestprice) + " per month";
    return env->NewStringUTF(bestbudjet.c_str());
}
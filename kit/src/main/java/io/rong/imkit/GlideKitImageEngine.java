package io.rong.imkit;

import android.content.Context;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import io.rong.imkit.model.UiMessage;


public class GlideKitImageEngine implements KitImageEngine {

    @Override
    public void loadCircleImage(@NonNull Context context, @NonNull String url, @NonNull ImageView imageView) {

    }

    @Override
    public void loadCircleImage(@NonNull Context context, @NonNull int resId, @NonNull ImageView imageView) {

    }

    /**
     * 加载gif
     *
     * @param context   上下文
     * @param url       图片路径
     * @param imageView 承载图片ImageView
     */
    @Override
    public void loadAsGifImage(@NonNull Context context, @NonNull String url,
                               @NonNull ImageView imageView) {
    }

    /**
     * 加载图片
     *
     * @param context
     * @param url
     * @param imageView
     */
    @Override
    public void loadImage(@NonNull Context context, @NonNull String url, @NonNull ImageView imageView) {
    }

    /**
     * 加载相册目录
     *
     * @param context   上下文
     * @param url       图片路径
     * @param imageView 承载图片ImageView
     */
    @Override
    public void loadFolderImage(@NonNull final Context context, @NonNull String url, @NonNull final ImageView imageView) {
    }

    /**
     * 加载图片列表图片
     *
     * @param context   上下文
     * @param url       图片路径
     * @param imageView 承载图片ImageView
     */
    @Override
    public void loadGridImage(@NonNull Context context, @NonNull String url, @NonNull ImageView imageView) {
    }

    @Override
    public void loadConversationListPortrait(@NonNull Context context, @NonNull String url, @NonNull ImageView imageView) {
    }

    @Override
    public void loadConversationPortrait(@NonNull Context context, @NonNull UiMessage uiMessage, @NonNull ImageView imageView, boolean isSender) {
    }
}

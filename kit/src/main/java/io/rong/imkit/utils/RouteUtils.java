package io.rong.imkit.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;

import io.rong.imkit.conversation.RongConversationActivity;
import io.rong.imkit.feature.forward.ForwardClickActions;
import io.rong.imlib.model.Conversation;
import io.rong.imlib.model.Message;
import io.rong.message.FileMessage;

public class RouteUtils {
    public static final String CONVERSATION_TYPE = "ConversationType";
    public static final String TARGET_ID = "targetId";
    public static final String CREATE_CHATROOM = "createIfNotExist";
    public static final String TITLE = "title";
    public static final String INDEX_MESSAGE_TIME = "indexTime";
    public static final String CUSTOM_SERVICE_INFO = "customServiceInfo";
    public static final String FORWARD_TYPE = "forwardType";
    public static final String MESSAGE_IDS = "messageIds";
    public static final String MESSAGE = "message";
    private static HashMap<RongActivityType, Class<? extends Activity>> sActivityMap = new HashMap<>();

    public static void routeToConversationActivity(Context context, Conversation.ConversationType type, String targetId) {
        routeToConversationActivity(context, type, targetId, null);
    }

    /**
     * 启动会话页面
     *
     * @param context  上下文
     * @param type     会话类型
     * @param targetId 目标 ID
     * @param bundle   启动 activity 时 intent 里需要携带的 bundle 信息。
     */
    public static void routeToConversationActivity(Context context, Conversation.ConversationType type, String targetId, Bundle bundle) {
        Class<? extends Activity> activity = RongConversationActivity.class;
        if (sActivityMap.get(RongActivityType.ConversationActivity) != null) {
            activity = sActivityMap.get(RongActivityType.ConversationActivity);
        }
        Intent intent = new Intent(context, activity);
        intent.putExtra(CONVERSATION_TYPE, type.getName().toLowerCase());
        intent.putExtra(TARGET_ID, targetId);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        context.startActivity(intent);
    }

    /**
     * 启动聚合会话页面
     *
     * @param context 上下文
     * @param type    聚合会话类型
     * @param title   标题
     */
    public static void routeToSubConversationListActivity(Context context, Conversation.ConversationType type, String title) {

    }

    /**
     * 启动 @ 功能选人页面
     *
     * @param context  上下文
     * @param targetId 目标 ID
     * @param type     会话类型
     */
    public static void routeToMentionMemberSelectActivity(Context context, String targetId, Conversation.ConversationType type) {

    }

    public static void routeToWebActivity(Context context, String url) {
        routeToWebActivity(context, url, null);
    }

    /**
     * 启动 web view 页面
     *
     * @param context 上下文
     * @param url     远端 url 地址
     * @param title   标题
     */
    public static void routeToWebActivity(Context context, String url, String title) {

    }

    public static void routeToFilePreviewActivity(Context context, Message message, FileMessage content, int progress) {

    }

    /**
     * 启动转发时选择会话页面
     *
     * @param fragment   当前 fragment
     * @param type       转发类型。{@link ForwardClickActions.ForwardType}
     * @param messageIds 转发的消息 id 列表。
     */
    public static void routeToForwardSelectConversationActivity(Fragment fragment, ForwardClickActions.ForwardType type, ArrayList<Integer> messageIds) {

    }

    /**
     * 启动合并转发消息的图片展示页面
     *
     * @param context 上下文
     * @param message 合并转发时携带的原始消息
     */
    public static void routeToCombinePicturePagerActivity(Context context, Message message) {

    }

    /**
     * 启动合并转发消息的在线展示页面
     *
     * @param context   上下文
     * @param messageId 消息 id
     * @param uri       远端 url 地址
     * @param type
     * @param title     标题
     */
    public static void routeToCombineWebViewActivity(Context context, int messageId, String uri, String type, String title) {

    }

    /**
     * 启动文件在线浏览页面
     *
     * @param context  上下文
     * @param fileUrl  文件远端地址
     * @param fileName 文件名称
     * @param fileSize 文件大小
     */
    public static void routeToWebFilePreviewActivity(Context context, String fileUrl, String fileName, String fileSize) {

    }

    public static void registerActivity(RongActivityType activityType, Class<? extends Activity> activity) {
        sActivityMap.put(activityType, activity);
    }

    public static Class<? extends Activity> getActivity(RongActivityType type) {
        return sActivityMap.get(type);
    }

    public enum RongActivityType {
        ConversationListActivity,
        SubConversationListActivity,
        ConversationActivity,
        MentionMemberSelectActivity,
        RongWebViewActivity,
        FilePreviewActivity,
        CombineWebViewActivity,
        CombinePicturePagerActivity,
        ForwardSelectConversationActivity,
        WebFilePreviewActivity,
    }
}

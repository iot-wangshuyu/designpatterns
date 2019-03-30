package com.shuyu.util;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @package:com.ganinfo.utils
 * @className:GsonUtil
 * @description:gson转换工具类
 * @author:Shuyu.Wang
 * @date:2018-11-30 18:13
 * @version:V1.0
 * @NOTICE：本内容仅限于新疆感知科技有限公司内部传阅,禁止外泄以及用于其他的商业目
 * @ Copyright © 2017-ganinfo. All rights reserved.
 **/
public class GsonUtil {

    private static Gson gson = null;

    static {
        if (gson == null) {
            gson = new Gson();
        }
    }

    private GsonUtil() {
    }

    /**
     * @author:shuyu.wang
     * @description:Object to String
     * @date: 2018/11/30 17:24
     * @param: object 对象
     * @return: String string json
     */
    public static String GsonString(Object object) {
        String gsonString = null;
        if (gson != null) {
            gsonString = gson.toJson(object);
        }
        return gsonString;
    }

    /**
     * @author:shuyu.wang
     * @description:gsonString to object
     * @date: 2018/11/30 17:31
     * @param: gsonString
     * @param: cls 目标类
     * @return: 实体类
     */
    public static <T> T GsonToBean(String gsonString, Class<T> cls) throws JsonSyntaxException {
        T t = null;
        if (gson != null && gsonString != null && !gsonString.equals("")) {
            t = gson.fromJson(gsonString, cls);
        }
        return t;
    }

    /**
     * json to list
     *
     * @param gsonString
     * @param cls
     * @return List<T>
     */

    /**
     * @author:shuyu.wang
     * @description:String to List<Object>
     * @date: 2018/11/30 17:33
     * @param: gsonString
     * @param: cls 目标类
     * @return: List
     */
    public static <T> List<T> GsonToList(String gsonString, Class<T> cls) throws JsonSyntaxException {
        List<T> list = new ArrayList<T>();
        if (gson != null && gsonString != null && !gsonString.equals("")) {
            JsonArray array = new JsonParser().parse(gsonString).getAsJsonArray();
            for (final JsonElement elem : array) {
                list.add(gson.fromJson(elem, cls));
            }
        }
        return list;
    }

    /**
     * @author:shuyu.wang
     * @description:String to List<Map>
     * @date: 2018/11/30 17:33
     * @param: gsonString
     * @return: List<Map<String, T>>
     */
    public static <T> List<Map<String, T>> GsonToListMaps(String gsonString) {
        List<Map<String, T>> list = null;
        if (gson != null) {
            list = gson.fromJson(gsonString, new TypeToken<List<Map<String, T>>>() {
            }.getType());
        }
        return list;
    }

    /**
     * @author:shuyu.wang
     * @description: String to Map
     * @date: 2018/11/30 17:34
     * @param: gsonString
     * @return: Map
     */
    public static <T> Map<String, T> GsonToMaps(String gsonString) {
        Map<String, T> map = null;
        if (gson != null) {
            map = gson.fromJson(gsonString, new TypeToken<Map<String, T>>() {
            }.getType());
        }
        return map;
    }

    /**
     * @author:shuyu.wang
     * @description:Object to JsonObject
     * @date: 2018/11/30 17:35
     * @param: object
     * @return: JsonObject
     */
    public static JsonObject GetJsonObject(Object object) {
        JsonObject jsonObject = null;
        if (gson != null) {
            jsonObject = gson.toJsonTree(object).getAsJsonObject();
        }
        return jsonObject;
    }

    /**
     * @author:shuyu.wang
     * @description:get value by key from jsonString
     * @date: 2018/11/30 17:35
     * @param: json
     * @param: key
     * @return: String
     */
    public static String GetValue(String json, String key) throws Exception {
        JsonObject jsonObject = null;
        if (gson != null) {
            jsonObject = new JsonParser().parse(json).getAsJsonObject();
        }
        if (jsonObject != null && jsonObject.has(key)) {
            return jsonObject.get(key).getAsString();
        }
        return null;
    }
}
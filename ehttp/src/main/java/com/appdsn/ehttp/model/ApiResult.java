/*
 * Copyright (C) 2017 zhouyou(478319399@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.appdsn.ehttp.model;

/**
 * 可以自定义类型继承自ApiResult，并重新get方法
 */
public abstract class ApiResult<T>{
    public abstract int getCode();
    public abstract String getMsg();
    public abstract T getData();
    public abstract boolean isResultOk();//根据code值判断服务端返回的结果是否成功
}

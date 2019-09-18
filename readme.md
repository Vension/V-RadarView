# V-RadarView - Android自定义View 雷达扫描效果。可以根据自己的需求配置View的主题颜色、扫描颜色、扫描速度、圆圈数量、是否显示水滴等。
* support androidX and Kotlin

[![License](https://img.shields.io/badge/License%20-Apache%202-337ab7.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![Arsenal](https://img.shields.io/badge/Arsenal%20-%20VisualizerView-4cae4c.svg)](https://android-arsenal.com/details/1/6001)
[![JCenter](https://api.bintray.com/packages/vension/vensionCenter/V-VisualizerView/images/download.svg)](https://bintray.com/vension/vensionCenter/V-VisualizerView/_latestVersion)
[![MinSdk](https://img.shields.io/badge/%20MinSdk%20-%2016%2B%20-f0ad4e.svg)](https://android-arsenal.com/api?level=16)
[![Author](https://img.shields.io/badge/Author-Vension-orange.svg?style=flat-square)](https://img.shields.io/badge/Author-Vension-orange.svg?style=flat-square)

[感谢原作者（Java版本）](https://github.com/donkingliang/RadarView)

## 效果预览
<p>
    <img src="/GIF.gif" style="width: 50%;"/>
</p>

## Download[ ![Download](https://api.bintray.com/packages/vension/maven/RadarView/images/download.svg) ](https://bintray.com/vension/maven/RadarView/_latestVersion)
``` gradle
 implementation 'kv.vension:radarview:_latestVersion'
```

## Usage

* **具体使用查看demo示例**

## attrs

| Attribute 属性           | Description 描述 |
|:---				       |:---|
| kv_circleColor             | 圆圈和交叉线的颜色      |
| kv_circleNum             | 圆圈的数量，默认3         |
| kv_sweepColor           | 扫描的颜色    |
| kv_raindropColor           | 水滴的颜色   |
| kv_raindropNum            | 水滴的数量，默认5|
| kv_showCrossLine            | 是否显示交叉线，默认true |
| kv_showRaindrop           | 是否显示水滴，默认true |
| kv_speed              | 扫描的转速，表示几秒转一圈 |
| kv_flicker              | 水滴显示和消失的速度 |

## update
* **V_0.0.1**: <初始化版本>

## License
```
 Copyright 2019, Vension

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```

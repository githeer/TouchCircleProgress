Touchable Circle Progress Bar
----------

![](screenshot/circleprogress.gif)

Usag
------

```
dependencies {    
    compile 'com.xuie:circleprogress:1.0.2'    
}    
```

```
<com.github.cool.circleprogress.DonutProgress
    android:layout_width="100dp"
    android:layout_height="100dp"
    android:layout_margin="10dp"
    app:donut_progress="45" />

<com.github.cool.circleprogress.CircleProgress
    android:layout_width="100dp"
    android:layout_height="100dp"
    android:layout_margin="10dp"
    app:circle_progress="80" />

<com.github.cool.circleprogress.ArcProgress
    android:layout_width="100dp"
    android:layout_height="100dp"
    android:layout_margin="10dp"
    app:arc_finished_color="#ff00ff00"
    app:arc_progress="45" />
```

From
-------
according to [CircleProgress](https://github.com/lzyzsd/CircleProgress) to add touch

License
-------
```
Copyright (C)  coolxuj Open Source Project

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
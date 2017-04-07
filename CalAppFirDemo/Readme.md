# 计算器 Android app demo

## 一、简单介绍

本程序是为了演示Android的一些简单布局，标签使用，方法绑定。制作计算器的基础部分


## 二、简单介绍

### 1.布局

#### 1)常用容器

##### 1>LinearLayout

这个容器是直线布局。由属性`orientation`控制为横向还是纵向

##### 2>RelativeLayout

这个容器的布局很随意，是根据当前元素之间的关系实现

#### 2)布局属性

使用`RelativeLayout`布局的话，默认所有元素都出现在左上角，会达到堆叠的效果。所以需要使用以下的属性进行布局

##### 1> layout_toRightOf/layout_toLeftOf

在指定元素的右侧或左侧。

##### 2> layout_below/layout_above

在指定元素的上方或下方。

##### 3> layout_alignParentBottom/layout_alignParentTop

在父元素的底部或顶部

##### 4> layout_alignParentLeft/layout_alignParentRight

在父元素的左端或右端


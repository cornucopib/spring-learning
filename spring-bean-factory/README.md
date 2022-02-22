# 简易的BeanFactory
一个简易的Bean容器，肯定需要容纳多个Bean，并且要有一个类持有Bean.

1. 容纳多个Bean,可以使用list以及map，list是用序号取值可读性不高，所以用map存储
2. Bean的持有类，可以认为是对Bean的定义。
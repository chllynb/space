# space

## 简介

旨在练习代码能力或者写demo的项目

## 模块说明

### component

用于组成基本组件与工具

### service

用于存放各种微服务或单体服务

### starter

封装开箱即用的starter

## 技术栈

本项目为多模块开发，微服务框架使用SpringCloud，服务发现与注册以及配置中心使用nacos及consul，网关使用gateway，后续考虑接入shenyu，
所有的单体服务采用SpringBoot做为基础框架，根据分支区分不同版本。数据库使用MySQL5.7版本，本地缓存（如有需要）使用Caffeine，第三方工具类使用HuTool。
分布式缓存使用redis，中间件采用rabbitmq，若后续有海量日志需求，可使用kafka替换。

##
# LeetCode Java 练习

本项目用于系统化地练习 LeetCode 算法题，使用 Java 17 + Maven + JUnit 5 构建。

## 项目结构

```
leetcode-java/
├── pom.xml                           # Maven 构建配置
├── README.md                         # 本文件
├── src/
│   ├── main/java/com/leetcode/       # 题解源码
│   │   ├── easy/                     # 简单题
│   │   ├── medium/                   # 中等题
│   │   └── hard/                     # 困难题
│   └── test/java/com/leetcode/       # 单元测试
│       ├── easy/
│       ├── medium/
│       └── hard/
```

## 环境要求

- JDK 17+
- Maven 3.8+

## 快速开始

### 编译项目
```bash
mvn compile
```

### 运行测试
```bash
mvn test
```

### 运行单个类的主方法
```bash
mvn exec:java -Dexec.mainClass="com.leetcode.easy.TwoSum"
```

### 添加新题目

1. 在对应难度包下创建解题类，命名规范为题目英文名（如 `TwoSum.java`）
2. 在同一包下创建对应的测试类（如 `TwoSumTest.java`）
3. 运行 `mvn test` 验证

## 已完成的题目

### 简单 (Easy)

| 题号 | 题目 | 源码 | 核心思路 |
|------|------|------|----------|
| 1 | Two Sum | [TwoSum.java](src/main/java/com/leetcode/easy/TwoSum.java) | 哈希表，一遍遍历 |

### 中等 (Medium)

> 待补充

### 困难 (Hard)

> 待补充

## 代码规范

- 每个解题类包含完整的 LeetCode 题目描述和链接
- 多种解法按时间/空间复杂度递进组织
- 最优解法使用标准方法名 `twoSum()`、`maxProfit()` 等
- 测试覆盖题目示例及边界情况

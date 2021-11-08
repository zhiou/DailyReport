package com.es.daily_report;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Collections;

// 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
public class CodeGenerator {

    public static void main(String[] args) {
        // 代码生成器
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/daily_report", "root", "1234qwer")
                .globalConfig(builder -> {
                    builder.author("zhiou") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("generated/mybatis"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.es") // 设置父包名
                            .moduleName("daily_report") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "generated/mybatis-xml")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("product", "project", "report", "task")
                            .serviceBuilder()
                            .entityBuilder()
                            .enableLombok()
                            .logicDeleteColumnName("deleted")
                            .enableTableFieldAnnotation()
                            .controllerBuilder()
                            .enableRestStyle()
                            .mapperBuilder()
                            .enableMapperAnnotation();
                })
                .execute();
    }

}

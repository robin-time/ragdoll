package com.ragdoll.sharding.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import org.junit.Test;

public class CodeGenerator {
    public static final String dbUrl =  "jdbc:mysql://localhost:3306/database0?useUnicode=true&characterEncoding=UTF-8" +
            "&useSSL=false&serverTimezone=UTC";
    @Test
    public void codeGenerator() {
        GlobalConfig globalConfig = new GlobalConfig.Builder()
                .outputDir(System.getProperty("user.dir") + "/src/main/java")
                .author("time")
                .dateType(DateType.ONLY_DATE)
                .build();
        DataSourceConfig dataSourceConfig = new DataSourceConfig.Builder(dbUrl, "root", "123456").build();
        PackageConfig packageConfig = new PackageConfig.Builder().parent("com.ragdoll.sharding")
                .moduleName("")
                .entity("entity")
                .service("service")
                .serviceImpl("service.impl")
                .mapper("mapper")
                .xml("mapper")
                .controller("controller")
                .build();
        StrategyConfig strategyConfig = new StrategyConfig.Builder()
                .addInclude("goods_0")
                .build();
        new AutoGenerator(dataSourceConfig).global(globalConfig)
                .strategy(strategyConfig)
                .packageInfo(packageConfig)
                .execute();

    }
}

package club.ndt.oauth.boot.db;

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.*;


public class JooqPgGenerator {

    /**
     * Jooq 自动化生成代码
     */
    private void gen() {
        Jdbc jdbc = new Jdbc().withDriver("com.p6spy.engine.spy.P6SpyDriver")
                .withUrl("jdbc:p6spy:postgresql://192.168.15.12:58083/oauth_boot?currentSchema=ndt")
                .withUser("postgres")
                .withPassword("incitedata");
        Database database = new Database()
                .withName("org.jooq.util.postgres.PostgresDatabase")
                .withSchemata(new Schema().withInputSchema("ndt"));
        Generator generator = new Generator()
                .withName("club.ndt.oauth.boot.db.MyJavaGenerator")
                .withDatabase(database)
                .withGenerate(new Generate().withPojos(true).withFluentSetters(true).withGeneratedAnnotation(true))
                .withStrategy(new Strategy().withName("club.ndt.oauth.boot.db.MyPrefixGeneratorStrategy"))
                .withTarget(new Target()
                        .withPackageName("club.ndt.oauth.boot.entity")
                        .withDirectory("src/main/java/"));
        Configuration conf = new Configuration()
                .withJdbc(jdbc)
                .withGenerator(generator);

        try {
            GenerationTool.generate(conf);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        JooqPgGenerator jg = new JooqPgGenerator();
        jg.gen();
        System.out.println("JooqPgGenerator finished.");
    }

}

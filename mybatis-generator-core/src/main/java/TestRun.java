import org.mybatis.generator.api.ShellRunner;

/**
 * Created by carlosli on 2015/11/4.
 */
public class TestRun {
    public static void main(String[] args) {
        String param[] = {"-configfile", "test.xml", "-overwrite"};
        ShellRunner.main(param);
    }
}

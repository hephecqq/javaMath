package dagong;

import org.quartz.JobDetail;
import org.quartz.SimpleTrigger;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.triggers.SimpleTriggerImpl;

/**
 * 使用SimpleTrigger进行调度
 * <p>
 * Created by DAGONG on 2017/1/23.
 */
public class SimpleTriggerRunner {

    public static void main(String[] args) {
        //创建一个JobDetail
        JobDetail jobDetail = new JobDetailImpl("jobDetail_Name", "jobDetail_Group_Name", SimpleJob.class);
        SimpleTrigger simpleTrigger = new SimpleTriggerImpl("simpleTriggerImpl_Name", "DelegatingLocalityJobDetail");

    }
}

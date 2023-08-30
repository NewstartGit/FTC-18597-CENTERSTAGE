package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="testMechanumONE", group="Linear Opmode")
public class testMechanumONE extends LinearOpMode
{
    MechanumClass mc = new MechanumClass();
    AprilTagClass aTag = new AprilTagClass();

    IMUClass imu = new IMUClass();
    @Override
    public void runOpMode() throws InterruptedException
    {
        mc.init(hardwareMap, true);
        aTag.initAprilTag(hardwareMap);
        imu.initIMU(hardwareMap);
        waitForStart();

        if(opModeIsActive())
        {
            mc.rotate(90,.1,10000, imu);
            //mc.rotate(-90,.25,10000,imu);

            /*
            boolean driveBool = true;
            while(opModeIsActive())
            {
                if(driveBool)
                {
                    driveBool = mc.strafeAroundAprilTag(.1,40,aTag);
                }
            }
            */
        }
    }
}

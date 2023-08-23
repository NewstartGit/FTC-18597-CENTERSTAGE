package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="testMechanumONE", group="Linear Opmode")
public class testMechanumONE extends LinearOpMode
{
    MechanumClass mc = new MechanumClass();
    AprilTagClass aTag = new AprilTagClass();
    @Override
    public void runOpMode() throws InterruptedException
    {
        mc.init(hardwareMap, true);
        aTag.initAprilTag(hardwareMap);

        waitForStart();

        if(opModeIsActive())
        {
            /*
            boolean waitForDistance = true;
            double distance;
            while(waitForDistance)
            {
                distance = aTag.returnAprilTagValues("Distance");
                mc.drive(90, .5, 10000, 2000, true);
                if(distance <= 20)
                {
                    waitForDistance = false;
                    mc.drive(0,0,0,0,false);
                }
            }
            mc.drive(90,.5,2000,2000,true);
            mc.drive(0,0,0,0,false);

             */
            boolean driveBool = true;
            while(opModeIsActive())
            {
                if(driveBool)
                {
                    driveBool = mc.driveForwardUntil(.1,30,aTag);
                }

            }
            /*
            mc.drive(0,.5,2000,2000);
            mc.drive(90,.5,2000,2000);
            mc.drive(180,.5,2000,2000);
            mc.drive(270,.5,2000,2000);
            mc.drive(0,.5,2000,2000);
             */

            //mc.driveForward(.25,5000, 2500);
            //telemetry.addData("x1 encoder val", mc.getEncoderVal(1));
            //telemetry.addData("x2 encoder val", mc.getEncoderVal(0));

            //telemetry.update();

        }
    }
}

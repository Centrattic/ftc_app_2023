// go to close junction to drop off preloaded; score at 5 high junctions

package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeBlueDark;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class BlueAutoCaseHighCycle1 {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .setColorScheme(new ColorSchemeBlueDark())
                .setDimensions(16, 16)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(12, 62, Math.toRadians(90)))
                                .lineTo(new Vector2d(12, 24))
                                .splineTo(new Vector2d(52,12), Math.toRadians(0))
                                .waitSeconds(0.75)
                                .lineTo(new Vector2d(20, 12))
                                .waitSeconds(0.75)
                                .lineTo(new Vector2d(52, 12))
                                .waitSeconds(0.75)
                                .lineTo(new Vector2d(20, 12))
                                .waitSeconds(0.75)
                                .lineTo(new Vector2d(52, 12))
                                .waitSeconds(0.75)
                                .lineTo(new Vector2d(20, 12))
                                .waitSeconds(0.75)
                                .lineTo(new Vector2d(52, 12))
                                .waitSeconds(0.75)
                                .lineTo(new Vector2d(20, 12))
                                .waitSeconds(0.75)
                                .lineTo(new Vector2d(52, 12))
                                .waitSeconds(0.75)
                                .lineTo(new Vector2d(20, 12))
                                .waitSeconds(0.75)
                                .lineTo(new Vector2d(52, 12))
                                .waitSeconds(0.75)
                                .lineTo(new Vector2d(20, 12))
                                .splineToConstantHeading(new Vector2d(10, 35), Math.toRadians(90))
                                .build()
                );

        meepMeep.setBackground(MeepMeep.Background.FIELD_POWERPLAY_KAI_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}
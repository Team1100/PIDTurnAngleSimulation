// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/** Add your docs here. */
public class FakeMotor {

    double m_speed;

    FakeMotor() {
        m_speed = 0;
    }

    void set(double speed) {
        m_speed = speed;
    }
}

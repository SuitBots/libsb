# libsb

Various utilities for use with ftc_app

## Using this in your project

First add the library to your list of dependencies. Here's an example
`TeamCode/build.gradle` file:

    apply from: '../build.common.gradle'
    android {
        buildToolsVersion '25.0.0'
    }
    dependencies {
        repositories { mavenCentral() }
        compile 'com.suitbots:libsb:0.0.1'
    }

The `dependencies` stanza is the important addition.

## Available classes

### Controller

The controller class wraps the usual `Gamepad` object and keeps track of
button state for you such that you can tell the first time each button is
pressed. Here's an example that lets you press X to reverse the drive
direction of your robot.

    import com.qualcomm.robotcore.eventloop.opmode.OpMode;
    import com.qualcomm.robotcore.hardware.DcMotor;
    import com.qualcomm.robotcore.hardware.DcMotorSimple;
    import com.suitbots.util.Controller;
    public class ReversibleDrive extends OpMode {
        private Controller c1;
        private boolean forward;
        private DcMotor left, right;
        @Override
        public void init() {
            c1 = new Controller(gamepad1);
            left = hardwareMap.dcMotor.get("leftMotor");
            right = hardwareMap.dcMotor.get("rightMotor");
            right.setDirection(DcMotorSimple.Direction.REVERSE);
        }
        @Override
        public void loop() {
            c1.update();
            telemetry.addData("Direction (x)", forward ? "Forward" : "Reverse");
            telemetry.update();
            if (c1.XOnce()) {
                forward = ! forward;
            }
            left.setPower(c1.left_stick_y * (forward ? 1.0 : -1.0));
            right.setPower(c1.right_stick_y * (forward ? 1.0 : -1.0));
        }
    }

### Blinken

This class wraps the FTC Servo class for use with Rev's Blinken lights controller.
Pass its constructor a servo and then call its named methods for blinking goodness.

    import com.suitbots.util.Blinken;

    [...]

    @Override public void runOpMode() {
        final Blinken blinken = new Blinken(hardwareMap.servo.get("led"));
        waitForStart();
        while(opModeIsActive()) {
            if (gamepad1.a) {
                blinken.enactSolidRed();
            } else {
                blinken.off(); // or blinken.enactSolidBlack()
            }
        }
    }

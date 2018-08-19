package com.suitbots.util;

import com.qualcomm.robotcore.hardware.PwmControl;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoImplEx;

public class Blinken {
    private final ServoImplEx servoImplEx;

    public Blinken(Servo servo) {
        servoImplEx = (ServoImplEx) servo;
        if (null == servoImplEx) {
            throw new RuntimeException("The servo you passed is not compatible with this library.");
        }
        servoImplEx.setPwmRange(new PwmControl.PwmRange(1000.0, 2000.0));

    }

    private void setPwm(final double pwmValue) {
        servoImplEx.setPosition((pwmValue - 1000.0) / 1000.0);
    }

    public void off() { enactSolidBlack(); }

    public void enactFixedPalettePatternRainbowRainbowPalette() { setPwm(1005.0); }
    public void enactFixedPalettePatternRainbowPartyPalette() { setPwm(1015.0); }
    public void enactFixedPalettePatternRainbowOceanPalette() { setPwm(1025.0); }
    public void enactFixedPalettePatternRainbowLavePalette() { setPwm(1035.0); }
    public void enactFixedPalettePatternRainbowForestPalette() { setPwm(1045.0); }
    public void enactFixedPalettePatternRainbowWithGlitter() { setPwm(1055.0); }
    public void enactFixedPalettePatternConfetti() { setPwm(1065.0); }
    public void enactFixedPalettePatternShotRed() { setPwm(1075.0); }
    public void enactFixedPalettePatternShotBlue() { setPwm(1085.0); }
    public void enactFixedPalettePatternShotWhite() { setPwm(1095.0); }
    public void enactFixedPalettePatternSinelonRainbowPalette() { setPwm(1105.0); }
    public void enactFixedPalettePatternSinelonPartyPalette() { setPwm(1115.0); }
    public void enactFixedPalettePatternSinelonOceanPalette() { setPwm(1125.0); }
    public void enactFixedPalettePatternSinelonLavaPalette() { setPwm(1135.0); }
    public void enactFixedPalettePatternSinelonForestPalette() { setPwm(1145.0); }
    public void enactFixedPalettePatternBeatsPerMinuteRainbowPalette() { setPwm(1155.0); }
    public void enactFixedPalettePatternBeatsPerMinutePartyPalette() { setPwm(1165.0); }
    public void enactFixedPalettePatternBeatsPerMinuteOceanPalette() { setPwm(1175.0); }
    public void enactFixedPalettePatternBeatsPerMinuteLavaPalette() { setPwm(1185.0); }
    public void enactFixedPalettePatternBeatsPerMinuteForestPalette() { setPwm(1195.0); }
    public void enactFixedPalettePatternFireMedium() { setPwm(1205.0); }
    public void enactFixedPalettePatternFireLarge() { setPwm(1215.0); }
    public void enactFixedPalettePatternTwinklesRainbowPalette() { setPwm(1225.0); }
    public void enactFixedPalettePatternTwinklesPartyPalette() { setPwm(1235.0); }
    public void enactFixedPalettePatternTwinklesOceanPalette() { setPwm(1245.0); }
    public void enactFixedPalettePatternTwinklesLavaPalette() { setPwm(1255.0); }
    public void enactFixedPalettePatternTwinklesForestPalette() { setPwm(1265.0); }
    public void enactFixedPalettePatternColorWavesRainbowPalette() { setPwm(1275.0); }
    public void enactFixedPalettePatternColorWavesPartyPalette() { setPwm(1285.0); }
    public void enactFixedPalettePatternColorWavesOceanPalette() { setPwm(1295.0); }
    public void enactFixedPalettePatternColorWavesLavaPalette() { setPwm(1305.0); }
    public void enactFixedPalettePatternColorWavesForestPalette() { setPwm(1315.0); }
    public void enactFixedPalettePatternLarsonScannerRed() { setPwm(1325.0); }
    public void enactFixedPalettePatternLarsonScannerGray() { setPwm(1335.0); }
    public void enactFixedPalettePatternLightChaseRed() { setPwm(1345.0); }
    public void enactFixedPalettePatternLightChaseBlue() { setPwm(1355.0); }
    public void enactFixedPalettePatternLightChaseGray() { setPwm(1365.0); }
    public void enactFixedPalettePatternHeartbeatRed() { setPwm(1375.0); }
    public void enactFixedPalettePatternHeartbeatBlue() { setPwm(1385.0); }
    public void enactFixedPalettePatternHeartbeatWhite() { setPwm(1395.0); }
    public void enactFixedPalettePatternHeartbeatGray() { setPwm(1405.0); }
    public void enactFixedPalettePatternBreathRed() { setPwm(1415.0); }
    public void enactFixedPalettePatternBreathBlue() { setPwm(1425.0); }
    public void enactFixedPalettePatternBreathGray() { setPwm(1435.0); }
    public void enactFixedPalettePatternStrobeRed() { setPwm(1445.0); }
    public void enactFixedPalettePatternStrobeBlue() { setPwm(1455.0); }
    public void enactFixedPalettePatternStrobeGold() { setPwm(1465.0); }
    public void enactFixedPalettePatternStrobeWhite() { setPwm(1475.0); }
    public void enactColorOneEndToEndBlendToBlack() { setPwm(1485.0); }
    public void enactColorOneLarsonScanner() { setPwm(1495.0); }
    public void enactColorOneLightChase() { setPwm(1505.0); }
    public void enactColorOneHeartbeatSlow() { setPwm(1515.0); }
    public void enactColorOneHeartbeatMedium() { setPwm(1525.0); }
    public void enactColorOneHeartbeatFast() { setPwm(1535.0); }
    public void enactColorOneBreathSlow() { setPwm(1545.0); }
    public void enactColorOneBreathFast() { setPwm(1555.0); }
    public void enactColorOneShot() { setPwm(1565.0); }
    public void enactColorOneStrobe() { setPwm(1575.0); }
    public void enactColorTwoEndToEndBlendToBlack() { setPwm(1585.0); }
    public void enactColorTwoLarsonScanner() { setPwm(1595.0); }
    public void enactColorTwoLightChase() { setPwm(1605.0); }
    public void enactColorTwoHeartbeatSlow() { setPwm(1615.0); }
    public void enactColorTwoHeartbeatMedium() { setPwm(1625.0); }
    public void enactColorTwoHeartbeatFast() { setPwm(1635.0); }
    public void enactColorTwoBreathSlow() { setPwm(1645.0); }
    public void enactColorTwoBreathFast() { setPwm(1655.0); }
    public void enactColorTwoShot() { setPwm(1665.0); }
    public void enactColorTwoStrobe() { setPwm(1675.0); }
    public void enactColorOneAndTwoSparkleColorOneOnColorTwo() { setPwm(1685.0); }
    public void enactColorOneAndTwoSparkleColorTwoOnColorOne() { setPwm(1695.0); }
    public void enactColorOneAndTwoColorGradientColorOneAndTwo() { setPwm(1705.0); }
    public void enactColorOneAndTwoBeatsPerMinuteColorOneAndTwo() { setPwm(1715.0); }
    public void enactColorOneAndTwoEndToEndBlendColorOneToTwo() { setPwm(1725.0); }
    public void enactColorOneAndTwoEndToEndBlend() { setPwm(1735.0); }
    public void enactColorOneAndTwoColorOneAndColorTwoNoBlending() { setPwm(1745.0); }
    public void enactColorOneAndTwoTwinklesColorOneAndTwo() { setPwm(1755.0); }
    public void enactColorOneAndTwoColorWavesColorOneAndTwo() { setPwm(1765.0); }
    public void enactColorOneAndTwoSinelonColorOneAndTwo() { setPwm(1775.0); }
    public void enactSolidHotPink() { setPwm(1785.0); }
    public void enactSolidDarkRed() { setPwm(1795.0); }
    public void enactSolidRed() { setPwm(1805.0); }
    public void enactSolidRedOrange() { setPwm(1815.0); }
    public void enactSolidOrange() { setPwm(1825.0); }
    public void enactSolidGold() { setPwm(1835.0); }
    public void enactSolidYellow() { setPwm(1845.0); }
    public void enactSolidLawnGreen() { setPwm(1855.0); }
    public void enactSolidLime() { setPwm(1865.0); }
    public void enactSolidDarkGreen() { setPwm(1875.0); }
    public void enactSolidGreen() { setPwm(1885.0); }
    public void enactSolidBlueGreen() { setPwm(1895.0); }
    public void enactSolidAqua() { setPwm(1905.0); }
    public void enactSolidSkyBlue() { setPwm(1915.0); }
    public void enactSolidDarkBlue() { setPwm(1925.0); }
    public void enactSolidBlue() { setPwm(1935.0); }
    public void enactSolidBlueViolet() { setPwm(1945.0); }
    public void enactSolidViolet() { setPwm(1955.0); }
    public void enactSolidWhite() { setPwm(1965.0); }
    public void enactSolidGray() { setPwm(1975.0); }
    public void enactSolidDarkGray() { setPwm(1985.0); }
    public void enactSolidBlack() { setPwm(1995.0); }
}

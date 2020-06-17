package com.pointware.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidateIPAddressTest {

    @Test
    public void testV4(){
        assertEquals(
                ValidateIPAddress.validIPAddress("172.16.254.1"),
                "IPv4"
        );
        assertEquals(
                ValidateIPAddress.validIPAddress("172.16.254.01"),
                "Neither"
        );

        assertEquals(
                ValidateIPAddress.validIPAddress("256.256.256.256"),
                "Neither"
        );
    }

    @Test
    public void testV6(){
        assertEquals(
                ValidateIPAddress.validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"),
                "IPv6"
        );

        assertEquals(
                ValidateIPAddress.validIPAddress("2001:0db8:85a3:0:0:8a2e:0370:7334"),
                "IPv6"
        );

        assertEquals(
                ValidateIPAddress.validIPAddress("2001:0db8:85a3::8A2E:0370:7334"),
                "Neither"
        );

        assertEquals(
                ValidateIPAddress.validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"),
                "Neither"
        );
    }
    @Test
    public void testFail(){
        assertEquals(
                ValidateIPAddress.validIPAddress("172.16.254.1."),
                "Neither"
        );
        assertEquals(
                ValidateIPAddress.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"),
                "Neither"
        );

        assertEquals(
                ValidateIPAddress.validIPAddress("2001:0db8:85a3:033:0:8A2E:0370:7334"),
                "IPv6"
        );

    }
}

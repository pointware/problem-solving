package com.pointware;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VersionTest  {

    // expected error messages:

    static final String errorVersionMustNotBeNull = "'version' must not be null!";
    static final String errorOtherMustNotBeNull =  "'other' must not be null!";
    static final String errorVersionMustMatchPattern =  "'version' must match: 'major.minor.patch(-SNAPSHOT)'!";

    @Rule public ExpectedException expectedException = ExpectedException.none();


    @Test
    public void no_exception_initialize(){
        Version version = new Version("3.8.0-SNAPSHOT");
    }

    @Test
    public void check_acceptable_format_for_initialize(){
        Version withSnapshot = new Version("3.8.0-SNAPSHOT");
        Version major = new Version("3");
        Version majorWithMinor = new Version("3.0");
        Version majorWithMinorAndPatch = new Version("3.0.2");
    }

    @Test
    public void errorVersionMustNotBeNull() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(errorVersionMustNotBeNull);
        Version version = new Version(null);
    }

    @Test
    public void errorOtherMustNotBeNull() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(errorOtherMustNotBeNull);
        Version version = new Version("3.8.0-SNAPSHOT");
        version.compareTo(null);
    }

    @Test
    public void errorVersionMustMatchPattern() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(errorVersionMustMatchPattern);
        Version version = new Version("1-1-1.8.0-SNAPSHOT");
    }

    @Test
    public void return_true_if_contains_snapshot(){
        Version snapshot = new Version("3.8.0-SNAPSHOT");
        assertTrue(snapshot.isSnapshot());
    }

    @Test
    public void snapshot_version_must_always_be_lower_non_snapshot(){
        Version snapshot = new Version("3.8.0-SNAPSHOT");
        Version nonSnapshot = new Version("3.8.0");
        assertEquals(1, nonSnapshot.compareTo(snapshot));
    }

    @Test
    public void version_comparison_condition(){
        Version snapshot = new Version("3.8.3-SNAPSHOT");
        Version nonSnapshot = new Version("3.8.3");
        assertEquals(1, nonSnapshot.compareTo(snapshot));
        Version lowerMinorVersion = new Version("3.7.3");
        assertEquals(1, nonSnapshot.compareTo(lowerMinorVersion));
        Version lowerPatchVersion = new Version("3.7.0");
        assertEquals(1, lowerMinorVersion.compareTo(lowerPatchVersion));
    }
}

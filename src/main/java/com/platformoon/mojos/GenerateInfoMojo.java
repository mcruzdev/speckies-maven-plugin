package com.platformoon.mojos;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "generate-info", defaultPhase = LifecyclePhase.PACKAGE)
public class GenerateInfoMojo extends AbstractMojo {

    @Parameter(property = "launchMode", defaultValue = "default")
    private String launchMode;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("The generate-info is running");
        getLog().info(String.format("Executing with launchMode: %s", launchMode));
    }

}

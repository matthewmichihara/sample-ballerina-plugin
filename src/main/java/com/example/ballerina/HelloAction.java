package com.example.ballerina;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class HelloAction extends AnAction {
  public void actionPerformed(AnActionEvent event) {
    Project project = event.getData(PlatformDataKeys.PROJECT);
    String txt =
        Messages.showInputDialog(
            project, "What is your name?", "Input Your Name", Messages.getQuestionIcon());
    Messages.showMessageDialog(
        project,
        "Hello, " + txt + "!\n I am glad to see you.",
        "Information",
        Messages.getInformationIcon());
  }
}

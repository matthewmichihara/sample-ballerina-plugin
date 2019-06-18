package com.example.ballerina;

import com.intellij.openapi.application.PreloadingActivity;
import com.intellij.openapi.progress.ProgressIndicator;
import org.jetbrains.annotations.NotNull;
import org.wso2.lsp4intellij.IntellijLanguageClient;
import org.wso2.lsp4intellij.client.languageserver.serverdefinition.RawCommandServerDefinition;

public class HelloPreloadingActivity extends PreloadingActivity {
  @Override
  public void preload(@NotNull ProgressIndicator indicator) {
    RawCommandServerDefinition serverDefinition =
        new RawCommandServerDefinition("txt", new String[] {"./all-caps-server", "--stdio"});
    IntellijLanguageClient.addServerDefinition(serverDefinition);
  }
}

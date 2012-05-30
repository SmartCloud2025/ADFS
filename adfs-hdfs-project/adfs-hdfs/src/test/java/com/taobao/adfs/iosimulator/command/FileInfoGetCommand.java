/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 \*   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.taobao.adfs.iosimulator.command;

import com.taobao.adfs.iosimulator.execute.IExecutor;
import com.taobao.adfs.iosimulator.execute.IExecutable.ExecuteType;
import com.taobao.adfs.iosimulator.state.StateFile;

public class FileInfoGetCommand extends AbstractCommand {

  int fileId;

  public FileInfoGetCommand(IExecutor executor, int fileId) {
    super(executor);
    this.fileId = fileId;
  }

  @Override
  public void execute() {
    StateFile sf = StateFile.createStateFile(fileId);
    try {
      executor.run(ExecuteType.FINDFILEID, sf);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
}

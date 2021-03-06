// Copyright 2012 Citrix Systems, Inc. Licensed under the
// Apache License, Version 2.0 (the "License"); you may not use this
// file except in compliance with the License.  Citrix Systems, Inc.
// reserves all rights not expressly granted by the License.
// You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// 
// Automatically generated by addcopyright.py at 04/03/2012
package com.cloud.async;

import com.cloud.agent.AgentManager;
import com.cloud.async.dao.AsyncJobDao;
import com.cloud.event.dao.EventDao;
import com.cloud.network.NetworkManager;
import com.cloud.network.dao.IPAddressDao;
import com.cloud.server.ManagementServer;
import com.cloud.storage.StorageManager;
import com.cloud.storage.dao.VolumeDao;
import com.cloud.storage.snapshot.SnapshotManager;
import com.cloud.user.AccountManager;
import com.cloud.user.dao.AccountDao;
import com.cloud.user.dao.UserDao;
import com.cloud.utils.component.Manager;
import com.cloud.vm.UserVmManager;
import com.cloud.vm.VirtualMachineManager;
import com.cloud.vm.dao.DomainRouterDao;
import com.cloud.vm.dao.UserVmDao;

public interface AsyncJobExecutorContext extends Manager {
	public ManagementServer getManagementServer();
	public AgentManager getAgentMgr();
	public NetworkManager getNetworkMgr();
	public UserVmManager getVmMgr();
	public SnapshotManager getSnapshotMgr();
	public AccountManager getAccountMgr();
	public StorageManager getStorageMgr();
	public EventDao getEventDao();
	public UserVmDao getVmDao();
	public AccountDao getAccountDao();
	public VolumeDao getVolumeDao();
    public DomainRouterDao getRouterDao();
    public IPAddressDao getIpAddressDao();
    public AsyncJobDao getJobDao();
    public UserDao getUserDao();
    public VirtualMachineManager getItMgr();
}

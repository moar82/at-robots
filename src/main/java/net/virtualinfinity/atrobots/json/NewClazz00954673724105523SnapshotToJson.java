package net.virtualinfinity.atrobots.json;

import net.virtualinfinity.atrobots.snapshots.ArenaObjectSnapshot;

public class NewClazz00954673724105523SnapshotToJson {
	private ArenaObjectSnapshot snapshot;
	private String type;
	private boolean includeVelocity;

	public NewClazz00954673724105523SnapshotToJson(NewClazz00826031723259842NewClazz00954673724105523SnapshotToJson parameterObject) {
		this.snapshot = parameterObject.getSnapshot();
		this.type = parameterObject.getType();
		this.includeVelocity = parameterObject.isIncludeVelocity();
	}

	public ArenaObjectSnapshot getSnapshot() {
		return snapshot;
	}

	public void setSnapshot(ArenaObjectSnapshot snapshot) {
		this.snapshot = snapshot;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isIncludeVelocity() {
		return includeVelocity;
	}

	public void setIncludeVelocity(boolean includeVelocity) {
		this.includeVelocity = includeVelocity;
	}
}
package nl.tweeenveertig.openstack.information;

import nl.tweeenveertig.openstack.headers.container.ContainerBytesUsed;
import nl.tweeenveertig.openstack.headers.container.ContainerObjectCount;
import nl.tweeenveertig.openstack.headers.container.ContainerRights;

public class ContainerInformation extends AbstractInformation {

    private ContainerObjectCount objectCount;

    private ContainerBytesUsed bytesUsed;

    private ContainerRights containerRights;

    public ContainerInformation() {
        this.containerRights = new ContainerRights(false);
    }

    public int getObjectCount() {
        return Integer.parseInt(objectCount.getHeaderValue());
    }

    public void setObjectCount(ContainerObjectCount objectCount) {
        this.objectCount = objectCount;
    }

    public long getBytesUsed() {
        return Long.parseLong(bytesUsed.getHeaderValue());
    }

    public void setBytesUsed(ContainerBytesUsed bytesUsed) {
        this.bytesUsed = bytesUsed;
    }

    public boolean isPublicContainer() {
        return containerRights.isPublic();
    }

    public void setPublicContainer(ContainerRights containerRights) {
        this.containerRights = containerRights;
    }
}
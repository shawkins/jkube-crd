package org.acme;

import io.dekorate.crd.annotation.Crd;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;

@Group("acme.org")
@Version("v1alpha1")
@Crd(group = "acme.org", version = "v1alpha1")
public class ResourceTwo {

}

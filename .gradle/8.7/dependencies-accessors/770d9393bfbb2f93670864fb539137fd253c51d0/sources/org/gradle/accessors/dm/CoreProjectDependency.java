package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class CoreProjectDependency extends DelegatingProjectDependency {

    @Inject
    public CoreProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":core:data"
     */
    public Core_DataProjectDependency getData() { return new Core_DataProjectDependency(getFactory(), create(":core:data")); }

    /**
     * Creates a project dependency on the project at path ":core:domain"
     */
    public Core_DomainProjectDependency getDomain() { return new Core_DomainProjectDependency(getFactory(), create(":core:domain")); }

    /**
     * Creates a project dependency on the project at path ":core:model"
     */
    public Core_ModelProjectDependency getModel() { return new Core_ModelProjectDependency(getFactory(), create(":core:model")); }

    /**
     * Creates a project dependency on the project at path ":core:repo"
     */
    public Core_RepoProjectDependency getRepo() { return new Core_RepoProjectDependency(getFactory(), create(":core:repo")); }

    /**
     * Creates a project dependency on the project at path ":core:ui"
     */
    public Core_UiProjectDependency getUi() { return new Core_UiProjectDependency(getFactory(), create(":core:ui")); }

}

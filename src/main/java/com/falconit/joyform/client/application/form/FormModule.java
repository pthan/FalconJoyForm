package com.falconit.joyform.client.application.form;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import com.falconit.joyform.client.application.form.editor.FormEditorModule;
import com.falconit.joyform.client.application.form.test.FormEditorTestModule;
import com.google.gwt.inject.client.AbstractGinModule;

/**
 * Created by Mark Kevin on 11/30/2015.
 */
public class FormModule extends AbstractGinModule {

    @Override
    protected void configure() {
        install(new FormEditorModule());//
         install(new FormEditorTestModule());//
    }
}
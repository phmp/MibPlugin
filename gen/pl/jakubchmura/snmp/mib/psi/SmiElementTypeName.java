// This is a generated file. Not intended for manual editing.
package pl.jakubchmura.snmp.mib.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import pl.jakubchmura.snmp.mib.reference.MibNodeReference;

public interface SmiElementTypeName extends SmiReferenceResolver {

  @NotNull
  PsiElement getIdentifierString();

  String getName();

  PsiElement setName(String name);

  MibNodeReference getReference();

  boolean shouldHaveReference();

}

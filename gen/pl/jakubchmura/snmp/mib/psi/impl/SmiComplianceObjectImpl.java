// This is a generated file. Not intended for manual editing.
package pl.jakubchmura.snmp.mib.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static pl.jakubchmura.snmp.mib.psi.SmiTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import pl.jakubchmura.snmp.mib.psi.*;

public class SmiComplianceObjectImpl extends ASTWrapperPsiElement implements SmiComplianceObject {

  public SmiComplianceObjectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmiVisitor visitor) {
    visitor.visitComplianceObject(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmiVisitor) accept((SmiVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmiSnmpAccessPart getSnmpAccessPart() {
    return findChildByClass(SmiSnmpAccessPart.class);
  }

  @Override
  @NotNull
  public SmiSnmpDescrPart getSnmpDescrPart() {
    return findNotNullChildByClass(SmiSnmpDescrPart.class);
  }

  @Override
  @Nullable
  public SmiSnmpSyntaxPart getSnmpSyntaxPart() {
    return findChildByClass(SmiSnmpSyntaxPart.class);
  }

  @Override
  @Nullable
  public SmiSnmpWriteSyntaxPart getSnmpWriteSyntaxPart() {
    return findChildByClass(SmiSnmpWriteSyntaxPart.class);
  }

  @Override
  @NotNull
  public SmiValue getValue() {
    return findNotNullChildByClass(SmiValue.class);
  }

}

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div>
<h2>Create a free Spitter account</h2>

<sf:form method="POST" modelAttribute="Spitter" 
         enctype="multipart/form-data">         
   <fieldset> 
   <table cellspacing="0">
     
      <tr>
         <th><sf:label path="userName">userName:</sf:label></th>
         <td><sf:input path="userName" size="15" maxlength="15" />
              <small id="userName_msg">No spaces, please.</small><br/>
             <sf:errors path="userName" cssClass="error" />

            </td>
      </tr>

      <tr>
         <th></th>
         <td><input name="commit" type="submit" 
                    value="I accept. Create my account." /></td>
      </tr>
   </table>
</fieldset>
</sf:form>
</div>
